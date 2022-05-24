package ma.casa.cigma.gestionbibliotheque.mapping;

import ma.casa.cigma.gestionbibliotheque.dto.AdhernetDto;
import ma.casa.cigma.gestionbibliotheque.dto.UserDto;
import ma.casa.cigma.gestionbibliotheque.entities.Adhernet;
import ma.casa.cigma.gestionbibliotheque.entities.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapping {

    ModelMapper modelMapper=new ModelMapper();

    public UserDto userDtoToBo(User user) {
        UserDto userDto=modelMapper.map(user,UserDto.class);
        return  userDto;
    }


    public User userBoToDto(UserDto userDto) {
        User user=modelMapper.map(userDto,User.class);
        return user;

    }
}
