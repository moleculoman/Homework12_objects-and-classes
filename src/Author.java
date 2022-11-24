public class Author  {
        private String authorFirstName;
        private String authorSurName;
        public Author(String authorFirstName, String authorSurName) {
        this.authorFirstName = authorFirstName;
        this.authorSurName = authorSurName;
        }

    public String getAuthorFullName(){
            return authorFirstName+ " "+ authorSurName;
    }
}
