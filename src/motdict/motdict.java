package motdict;

public class motdict {
	
    private String mot;
    private String definition;

    public motdict(String mot, String definition) {
        this.mot = mot;
        this.definition = definition;
    }

    public String getMot() {
        return mot;
    }

    public void setMot(String mot) {
        this.mot = mot;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public boolean synonyme(String newmot) {
        return this.mot.equals(newmot);
    }
}
