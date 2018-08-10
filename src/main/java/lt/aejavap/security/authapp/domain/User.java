package lt.aejavap.security.authapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
//@Data
//@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USER")
public class User implements Serializable {

    private static final long serialVersionUID = -2749854678606598488L;

    @Id
    @Column(name = "username", unique = true)
    private String userName;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private Set<AccountRole> roles = new HashSet<>();

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                '}';
    }
}
