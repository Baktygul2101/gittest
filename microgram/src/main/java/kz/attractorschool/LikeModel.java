public class LikeModel{

    public static class Like{
        private int idLike;
        private String whoLikes;
        private String whatLikes;
        private LocalDateTime timeLike;

        public int getIdLike() {
            return idLike;
        }

        public void setIdLike(int idLike) {
            this.idLike = idLike;
        }

        public String getWhoLikes() {
            return whoLikes;
        }

        public void setWhoLikes(String whoLikes) {
            this.whoLikes = whoLikes;
        }

        public String getWhatLikes() {
            return whatLikes;
        }

        public void setWhatLikes(String whatLikes) {
            this.whatLikes = whatLikes;
        }

        public LocalDateTime getTimeLike() {
            return timeLike;
        }

        public void setTimeLike(LocalDateTime timeLike) {
            this.timeLike = timeLike;
        }


    }
}