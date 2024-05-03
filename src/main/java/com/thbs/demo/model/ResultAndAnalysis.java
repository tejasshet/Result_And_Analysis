package com.thbs.demo.model;
import java.util.List;
import java.util.Map;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Document(value="result_and_analysis")
public class ResultAndAnalysis {

	
	@Id
    private Long resultId;
    private String batchNo;
    private Integer userId;
    private Long assessmentId;
    private String subject;
    private Map<String, Map<String, Integer>> subtopics; // Subtopic -> Difficulty Level -> Correctly Answered
    private Map<String, Integer> difficultyLevelCorrectlyAnswered;
    private Map<String, Integer> questionAttempted; // "crt" for correct, "wrong" for wrong
    private Integer questionNotAttempted;
    private Integer numberOfViolations;
    private String typeOfAssessment; // "regular" or "re-assessment"
    private Long totalMarks;
    private Map<String, Integer> totalNumberOfQuestions; // Total Questions, Easy, Medium, Hard (QP endPoint)
    private Integer totalQuestions;  // total questions in that assessment 
    //private List<Long> questionIds;
    private Map<Long, List<String>> questionIdsWithAnswers;
    private String status; // "pass" or "fail"
    private Map<Long, List<String>> userAnswers;
	public Long getResultId() {
		return resultId;
	}
	public void setResultId(Long resultId) {
		this.resultId = resultId;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Long getAssessmentId() {
		return assessmentId;
	}
	public void setAssessmentId(Long assessmentId) {
		this.assessmentId = assessmentId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Map<String, Map<String, Integer>> getSubtopics() {
		return subtopics;
	}
	public void setSubtopics(Map<String, Map<String, Integer>> subtopics) {
		this.subtopics = subtopics;
	}
	public Map<String, Integer> getDifficultyLevelCorrectlyAnswered() {
		return difficultyLevelCorrectlyAnswered;
	}
	public void setDifficultyLevelCorrectlyAnswered(Map<String, Integer> difficultyLevelCorrectlyAnswered) {
		this.difficultyLevelCorrectlyAnswered = difficultyLevelCorrectlyAnswered;
	}
	public Map<String, Integer> getQuestionAttempted() {
		return questionAttempted;
	}
	public void setQuestionAttempted(Map<String, Integer> questionAttempted) {
		this.questionAttempted = questionAttempted;
	}
	public Integer getQuestionNotAttempted() {
		return questionNotAttempted;
	}
	public void setQuestionNotAttempted(Integer questionNotAttempted) {
		this.questionNotAttempted = questionNotAttempted;
	}
	public Integer getNumberOfViolations() {
		return numberOfViolations;
	}
	public void setNumberOfViolations(Integer numberOfViolations) {
		this.numberOfViolations = numberOfViolations;
	}
	public String getTypeOfAssessment() {
		return typeOfAssessment;
	}
	public void setTypeOfAssessment(String typeOfAssessment) {
		this.typeOfAssessment = typeOfAssessment;
	}
	public Long getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(Long totalMarks) {
		this.totalMarks = totalMarks;
	}
	public Map<String, Integer> getTotalNumberOfQuestions() {
		return totalNumberOfQuestions;
	}
	public void setTotalNumberOfQuestions(Map<String, Integer> totalNumberOfQuestions) {
		this.totalNumberOfQuestions = totalNumberOfQuestions;
	}
	public Integer getTotalQuestions() {
		return totalQuestions;
	}
	public void setTotalQuestions(Integer totalQuestions) {
		this.totalQuestions = totalQuestions;
	}
	public Map<Long, List<String>> getQuestionIdsWithAnswers() {
		return questionIdsWithAnswers;
	}
	public void setQuestionIdsWithAnswers(Map<Long, List<String>> questionIdsWithAnswers) {
		this.questionIdsWithAnswers = questionIdsWithAnswers;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Map<Long, List<String>> getUserAnswers() {
		return userAnswers;
	}
	public void setUserAnswers(Map<Long, List<String>> userAnswers) {
		this.userAnswers = userAnswers;
	}
}
