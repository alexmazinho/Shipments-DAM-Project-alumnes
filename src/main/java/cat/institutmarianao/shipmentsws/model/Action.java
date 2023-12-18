package cat.institutmarianao.shipmentsws.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name = "Action")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Action implements Serializable {

	private static final long serialVersionUID = 1L;

	/* Values for type - MUST be constants */
	public static final String RECEPTION = "RECEPTION";
	public static final String ASSIGNMENT = "ASSIGNMENT";
	public static final String DELIVERY = "DELIVERY";

	public enum Type {
		RECEPTION, ASSIGNMENT, DELIVERY
	}

	/* Lombok */
	@EqualsAndHashCode.Include
	protected Long id;

	protected Type type;

	protected User performer;

	protected Date date = new Date();

	protected Shipment shipment;
}
