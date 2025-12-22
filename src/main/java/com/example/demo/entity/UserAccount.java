@Entity
@Getter @Setter
public class UserAccount {
    @Id @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private String role;
}
