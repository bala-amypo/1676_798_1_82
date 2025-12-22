@Entity
@Table(name = "anomaly_rules")
@Getter @Setter
public class AnomalyRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String ruleCode;

    private String description;
    private String thresholdType;
    private Double thresholdValue;
    private Boolean active = true;
}
