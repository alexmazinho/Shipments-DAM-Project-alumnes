package cat.institutmarianao.shipmentsws.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "actions")
@EqualsAndHashCode(callSuper = true)
public class Reception extends Action implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer trackingNumber;
}
