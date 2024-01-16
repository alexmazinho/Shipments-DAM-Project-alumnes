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
public class Receptionist extends User implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final int MAX_PLACE = 100;

	@JoinColumn(name = "office_id")
	@ManyToOne(fetch = FetchType.LAZY)
	private Office office;

	@Column(name = "place")
	private String place;
}
