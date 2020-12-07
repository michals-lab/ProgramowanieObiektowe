package pl.michaljd.stolarczyk;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Instrument {
    private String producent;
    private LocalDate rokProdukcji;

    public Instrument(String producent, LocalDate rokProdukcji) {
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    public abstract String dzwiek();

    public String getProducent() {
        return producent;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

    @Override
    public boolean equals(Object o) { return this.toString().equals(o.toString()); }

    @Override
    public int hashCode() { return Objects.hash(producent, rokProdukcji); }

    @Override
    public String toString() {
        return "Instrument{" +
                "producent='" + producent + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                '}';
    }
}
