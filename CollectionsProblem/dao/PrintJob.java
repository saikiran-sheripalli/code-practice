package NewWorkSpace.dao;


public class PrintJob {

    private Integer jobId;
    private String jobDescription;
    private Integer priority;

        public PrintJob(Integer jobId, String jobDescription, Integer priority) {
        this.jobId = jobId;
        this.jobDescription = jobDescription;
        this.priority = priority;
    }

        public Integer getJobId() {
            return jobId;
        }

        public void setJobId(Integer jobId) {
            this.jobId = jobId;
        }

        public String getJobDescription() {
            return jobDescription;
        }

        public void setJobDescription(String jobDescription) {
            this.jobDescription = jobDescription;
        }

        public Integer getPriority() {
            return priority;
        }

        public void setPriority(Integer priority) {
            this.priority = priority;
        }

        @Override
        public String toString() {
            return "PrintJob [jobId=" + jobId + ", jobDescription=" + jobDescription + ", priority=" + priority + "]";
        }

    
}
