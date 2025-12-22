@Entity
@Table(name = "employee_profiles")
@Getter @Setter
public class EmployeeProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String employeeId;

    private String fullName;

    @Column(unique = true)
    private String email;

    private String teamName;
    private String role;
    private Boolean active = true;

    private LocalDateTime createdAt;

    @PrePersist
    void onCreate() {
        createdAt = LocalDateTime.now();
    }
}
