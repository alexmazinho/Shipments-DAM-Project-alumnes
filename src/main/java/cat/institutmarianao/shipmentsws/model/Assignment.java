package cat.institutmarianao.shipmentsws.model;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "actions")
@EqualsAndHashCode(callSuper = true)
public class Assignment extends Action implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final int MIN_PRIORITAT = 1;
    public static final int MAX_PRIORITAT = 3;

    @JoinColumn(name = "courier_username")
    @ManyToOne(fetch = FetchType.LAZY)
    private Courier courier;

    @Column(name = "priority")
    private Integer priority;
}
