package practice7_problems;

public class P3_NicknameTag {

        // Immutable class: fields are final
        private final String firstName;
        private final String lastName;
        private final String nickname;

        public P3_NicknameTag(String fullName) {
            if (fullName == null || !fullName.contains(" ")) {
                throw new IllegalArgumentException("Full name must contain exactly one first name and one last name separated by a space.");
            }
            String[] parts = fullName.trim().split("\\s+");
            this.firstName = parts[0];
            this.lastName = parts[1];
            // Split once in the constructor and cache the formatted nickname
            this.nickname = this.firstName + " " + this.lastName.charAt(0) + ".";
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getNickname() {
            return nickname;
        }

        public static void main(String[] args) {
            P3_NicknameTag tag = new P3_NicknameTag("Sana Lim");
            System.out.println("tag.getNickname() -> \"" + tag.getNickname() + "\"");
        }
    }


