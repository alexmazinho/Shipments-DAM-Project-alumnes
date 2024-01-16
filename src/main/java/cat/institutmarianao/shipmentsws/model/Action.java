package cat.institutmarianao.shipmentsws.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "actions")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public abstract class Action implements Serializable {
    private static final long serialVersionUID = 1L;

    // Values for type - Must be final
    public static final String RECEPTION = "RECEPTION";
    public static final String ASSIGNMENT = "ASSIGNMENT";
    public static final String DELIVERY = "DELIVERY";

    public enum Type {
        RECEPTION, ASSIGNMENT, DELIVERY
    }

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false, insertable = false, updatable = false)
    protected Type type;

    @JoinColumn(name = "performer_username")
    @OneToOne(fetch = FetchType.LAZY)
    protected User performer;

    @Column(name = "date", nullable = false)
    protected Date date = new Date();

    @JoinColumn(name = "shipment_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    protected Shipment shipment;
}
