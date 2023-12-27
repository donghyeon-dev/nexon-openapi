package com.autocat.nexonopenapi.dto;

import com.autocat.nexonopenapi.dto.inner.HexaCoreEquipment;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;


/**
 * BlahBlah Entity 의 DT 를 도와주는 DTO 클래스
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CharacterHexaMatrix {

    private OffsetDateTime date;

    @JsonProperty("character_hexa_core_equipment")
    private List<HexaCoreEquipment> characterHexaCoreEquipment;
}
