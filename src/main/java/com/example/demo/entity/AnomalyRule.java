@Entity
@Getter @Setter
public class AnomalyRule {
    @Id @GeneratedValue
    private Long id;
    private String ruleName;
    private int threshold;
}
