@Entity
@Getter @Setter
public class ProductivityMetricRecord {
    @Id @GeneratedValue
    private Long id;
    private Long employeeId;
    private int hoursWorked;
    private int tasksCompleted;
}
