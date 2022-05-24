package ma.casa.cigma.gestionbibliotheque.service;

import ma.casa.cigma.gestionbibliotheque.domaine.RoleVo;
import ma.casa.cigma.gestionbibliotheque.domaine.UserVo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    void save(UserVo user);
    void save(RoleVo role);
    List<UserVo> getAllUsers();
    List<RoleVo> getAllRoles();
    RoleVo getRoleByName(String role);
    void cleanDataBase();
    boolean existsByUsername(String username);
    UserVo findByUsername(String username);

}
