public class CommentModel{
    private Comment comment = new Comment(0, "");

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }



    public CommentModel() {
    }

    public static class Comment {
        private int idComment;
        private String commentText;
        private LocalDateTime timeCom;

        public Comment(int idComment, String commentText, String timeCom) {
            this.idComment= idComment;
            this.commentText = commentText;
            this.timeCom = timeCom;
        }
        public Comment() {

        }
    }
        public int getIdComment() {
            return idComment;
        }

        public void setIdComment(int idComment) {
            this.idComment = idComment;
        }

        public String getCommentText() {
            return commentText;
        }

        public void setCommentText(String commentText) {
            this.commentText = commentText;
        }

        public LocalDateTime getTimeCom() {
            return timeCom;
        }

        public void setTimeCom(LocalDateTime timeCom) {
            this.timeCom = timeCom;
        }





}