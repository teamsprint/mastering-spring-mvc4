package kr.co.hanbit.mastering.profile;

import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jhkim on 2017. 6. 12..
 */
@Data
public class ProfileForm {
    private String twitterHandler;
    private String email;
    private LocalDate birthDate;
    private List<String> tastes = new ArrayList<>();
}
