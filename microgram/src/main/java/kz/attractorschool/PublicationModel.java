package kz.attractorschool.microgram;
public class PublicationModel{
    private Publication publication = new Publication(0, "");

    public kz.attractorschool.microgram.PublicationModel.Publication getPublication() {
        return publication;
    }

    public void setPublication(kz.attractorschool.microgram.PublicationModel.Publication publication) {
        this.publication = publication;
    }



    public PublicationModel() {
    }


    public static class Publication {
        private int idPublic;
        private String imageLink;
        private LocalDateTime timePub;
        private String description;

        public Publication() {

        }
        public Publication(int idPublic, String imageLink, String timePub, String description) {
            this.idPublic= idPublic;
            this.imageLink = imageLink;
            this.timePub = timePub;
            this.description=description;
        }

        public Publication(int idPublic, String imageLink) {
            this(idPublic,imageLink, null, null);
        }

        public Publication(int idPublic, String imageLink, String timePub) {
            this(idPublic, imageLink, timePub, null);
        }

        public int getIdPublic() {
            return idPublic;
        }

        public void setIdPublic(int idPublic) {
            this.idPublic = idPublic;
        }

        public String getImageLink() {
            return imageLink;
        }

        public void setImageLink(String imageLink) {
            this.imageLink = imageLink;
        }

        public LocalDateTime getTimePub() {
            return timePub;
        }

        public void setTimePub(LocalDateTime timePub) {
            this.timePub = timePub;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }





    }
}