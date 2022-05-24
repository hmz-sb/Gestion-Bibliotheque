package ma.casa.cigma.gestionbibliotheque.mapping;

import ma.casa.cigma.gestionbibliotheque.dto.AdhernetDto;
import ma.casa.cigma.gestionbibliotheque.dto.RoleDto;
import ma.casa.cigma.gestionbibliotheque.entities.Adhernet;
import ma.casa.cigma.gestionbibliotheque.entities.Role;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class RoleMapping {

    ModelMapper modelMapper=new ModelMapper();

    public RoleDto roleDtoToBo(Role role) {
        RoleDto roleDto=modelMapper.map(role,RoleDto.class);
        return roleDto;
    }


    public Role roleBoToDto(RoleDto roleDto) {
        Role role=modelMapper.map(roleDto,Role.class);
        return role;

    }

}
