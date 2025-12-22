public interface TeamSummaryRecordRepository
        extends JpaRepository<TeamSummaryRecord, Long> {
    List<TeamSummaryRecord> findByTeamName(String teamName);
}
