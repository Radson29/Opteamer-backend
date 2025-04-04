package io.medsys.opteamer.mapper;

import io.medsys.opteamer.dto.OperationRoomDTO;
import io.medsys.opteamer.model.OperationRoom;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface OperationRoomMapper {

    OperationRoomMapper INSTANCE = Mappers.getMapper(OperationRoomMapper.class);

    OperationRoomDTO toOperationRoomDTO(OperationRoom operationRoom);

    OperationRoom toOperationRoom(OperationRoomDTO operationRoomDTO);

}

