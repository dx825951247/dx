package com.ecust.service;

import java.util.List;
import java.util.Map;

import com.ecust.pojo.Company;
import com.ecust.pojo.Equipment;



public interface EquipmentService {

	Map<String, Object> queryAllEquipment(int pageNo, int pageSize, String name, int applied);

	List<Map<String, Object>> queryAllEquipmentForValidation();

	Map<String, Object> queryEquipmentById(int equipmentId);

	Boolean updateEquipment(Equipment equipment);

	Boolean createEquipment(Company company);

	Boolean deleteEquipment(String equipmentId);

	Boolean apply(String equipmentId);

	Map<String, Object> queryAllType();

	boolean createType(String createId, String typeName);

	Boolean deleteType(String typeId);

	Boolean updateStatus(int id,int status);

}
