package io.medsys.opteamer.model.embeddedids;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AssessmentId implements Serializable {
    @Column(name = "patient_id")
    private Long patientId;
    @Column(name = "team_member_id")
    private Long teamMemberId;
    @Column(name = "pre_op_a_id")
    private String preOpAId;

}
