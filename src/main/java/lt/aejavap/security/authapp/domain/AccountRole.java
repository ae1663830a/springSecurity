package lt.aejavap.security.authapp.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
//@Data
//@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ACCOUNT_ROLES")
public class AccountRole implements Serializable {

    private static final long serialVersionUID = 3213123135435L;

    @Id
    @Column(name = "ROLE")
    private String role;

    @ManyToOne
    @JoinColumn(name = "USERNAME", referencedColumnName = "username")
    private User user;

    @Override
    public String toString() {
        return "AccountRole{" +
                "role='" + role + '\'' +
//                ", user=" + user +
                '}';
    }
}
