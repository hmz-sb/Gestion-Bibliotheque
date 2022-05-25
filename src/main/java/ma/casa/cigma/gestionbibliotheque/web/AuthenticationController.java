package ma.casa.cigma.gestionbibliotheque.web;

import java.util.Collection;
import javax.validation.Valid;

import ma.casa.cigma.gestionbibliotheque.errors.BusinessException;
import ma.casa.cigma.gestionbibliotheque.jwt.JwtUtils;
import ma.casa.cigma.gestionbibliotheque.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ma.casa.cigma.gestionbibliotheque.domaine.RoleVo;
import ma.casa.cigma.gestionbibliotheque.domaine.TokenVo;
import ma.casa.cigma.gestionbibliotheque.domaine.UserVo;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    private UserService userService;
    @Autowired
    private JwtUtils jwtUtils;
    @PostMapping("/signin")
    public ResponseEntity<TokenVo> authenticateUser(@Valid @RequestBody UserVo userVo) {
        try {
            Authentication authentication = authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(userVo.getUsername(), userVo.getPassword()));
            SecurityContextHolder.getContext().setAuthentication(authentication);
            String jwt = jwtUtils.generateJwtToken(authentication);
            TokenVo tokenVo = new TokenVo();
            tokenVo.setJwttoken(jwt);
            tokenVo.setUsername(userVo.getUsername());
            Collection<? extends GrantedAuthority> list = authentication.getAuthorities();
            list.forEach(authorite -> tokenVo.getRoles().add(authorite.getAuthority())); return ResponseEntity.ok(tokenVo);
        } catch (Exception e) {
            throw new BusinessException("Login ou mot de passe incorrect");
        }
    }
    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody UserVo userVo) {
        if (userService.existsByUsername(userVo.getUsername())) { return ResponseEntity.badRequest().body("Error: Username is already taken!");
        }
// par défaut, le client a le rôle CLIENT
        userVo.getRoles().add(new RoleVo("CLIENT"));
        userService.save(userVo); return ResponseEntity.ok("User registered successfully!");
    }
}
