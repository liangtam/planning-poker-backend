package com.planningpoker.service.interfaces;

import com.planningpoker.exceptions.NotFoundException;
import com.planningpoker.model.IssueModel;
import com.planningpoker.model.RoomModel;
import com.planningpoker.model.UserModel;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface RoomService {
    RoomModel createRoom(String roomCode);
    boolean doesRoomExist(String roomCode);

    void deleteRoom(String roomCode) throws NotFoundException;
    List<UserModel> getUsersFromRoom(String roomCode) throws Exception;
    Optional<RoomModel> getRoomByCode(String roomCode);
    Optional<RoomModel> getRoomById(ObjectId id);
    void addIssueToRoom(IssueModel issue, String roomCode) throws NotFoundException;
    List<IssueModel> getIssuesFromRoom(String roomCode) throws NotFoundException;
    void addUserToRoom(String roomCode, UserModel user) throws NotFoundException;
}
