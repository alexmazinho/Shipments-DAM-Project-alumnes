package cat.institutmarianao.shipmentsws.model;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "users")
@EqualsAndHashCode(callSuper = true)
public class Courier extends User implements Serializable {
	private static final long serialVersionUID = 1L;

	@JoinColumn(name = "company_id")
	@ManyToOne(fetch = FetchType.LAZY)
	private Company company;
}
