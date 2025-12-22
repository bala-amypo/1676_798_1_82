@Entity
@Getter @Setter
public class AnomalyFlagRecord {
    @Id @GeneratedValue
    private Long id;
    private Long employeeId;
    private String reason;
}
