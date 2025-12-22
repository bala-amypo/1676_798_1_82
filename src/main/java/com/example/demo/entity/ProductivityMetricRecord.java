@Entity
@Table(
  name = "productivity_metric_records",
  uniqueConstraints = @UniqueConstraint(columnNames = {"employee_id", "date"})
)
@Getter @Setter
public class ProductivityMetricRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private Double hoursLogged;
    private Integer tasksCompleted;
    private Integer meetingsAttended;
    private Double productivityScore;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private EmployeeProfile employee;

    private LocalDateTime submittedAt;

    @PrePersist
    void onSubmit() {
        submittedAt = LocalDateTime.now();
    }
}
