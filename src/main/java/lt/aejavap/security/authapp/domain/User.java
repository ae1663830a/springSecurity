package lt.aejavap.security.authapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USER")
public class User implements Serializable {

    @Id
    @Column(name = "username", unique = true)
    private String userName;

    @Column(name = "password")
    private String password;
}
