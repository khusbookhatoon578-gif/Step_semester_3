package practice7_problems;

public class A3_PasswordChecker {

        // Private final password: never revealed via any getter
        private final String password;

        public A3_PasswordChecker(String password) {
            this.password = (password != null) ? password : "";
        }

        // Exposes only computed strength rating based on length
        public String getStrength() {
            int len = password.length();
            if (len < 6) {
                return "Weak";
            } else if (len <= 9) {
                return "Medium";
            } else {
                return "Strong";
            }
        }

        public static void main(String[] args) {
            A3_PasswordChecker pc = new A3_PasswordChecker("8685");
            System.out.println("pc.getStrength() -> \"" + pc.getStrength() + "\"");

            A3_PasswordChecker pc2 = new A3_PasswordChecker("d48a");
            System.out.println("pc2.getStrength() -> \"" + pc2.getStrength() + "\"");
        }
    }


