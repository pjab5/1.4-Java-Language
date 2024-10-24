package Level1;

import java.util.Objects;
import java.util.regex.Pattern;

public class DNILetter {
    private String DNI;

    public DNILetter(String DNI) {
        this.DNI = DNI;
    }

    public String getDNILetter(){
        if(Pattern.compile("^[0-9]{8}[A-Z]$").matcher(DNI).matches()){
            return String.valueOf(DNI.charAt(DNI.length()-1));
        }
        return null;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        DNILetter dniLetter = (DNILetter) object;
        return Objects.equals(DNI, dniLetter.DNI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DNI);
    }
}
