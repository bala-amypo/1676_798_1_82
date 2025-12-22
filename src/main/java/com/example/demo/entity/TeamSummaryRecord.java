@Entity
@Getter @Setter
public class TeamSummaryRecord {
    @Id @GeneratedValue
    private Long id;
    private String teamName;
    private double avgProductivity;
}
