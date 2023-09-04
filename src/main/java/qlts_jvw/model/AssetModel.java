package qlts_jvw.model;

public class AssetModel {
	private final String assetCode;
	private String assetName;
	private final String assetID;
	private String assStatusName;
	private String floorName;
	private String floorId;
	private String assetStatus;
	private Double buyPrice;
	private Double remainATM;
	private Double remainAmortizedAmt;
	private String empUse;
	private String useDate;
	private String notes;
	private String serial;
	private String createDT;
	private String makerID;
	private String typeId;

	public AssetModel(String assetCode, String assetName, String assetID, String assStatusName, String floorName,
			String floorId, String assetStatus, Double buyPrice, Double remainATM, Double remainAmortizedAmt,
			String empUse, String useDate, String notes, String serial, String createDT, String makerID,
			String typeId) {
		this.assetCode = assetCode;
		this.assetName = assetName;
		this.assetID = assetID;
		this.assStatusName = assStatusName;
		this.floorName = floorName;
		this.floorId = floorId;
		this.assetStatus = assetStatus;
		this.buyPrice = buyPrice;
		this.remainATM = remainATM;
		this.remainAmortizedAmt = remainAmortizedAmt;
		this.empUse = empUse;
		this.useDate = useDate;
		this.notes = notes;
		this.serial = serial;
		this.createDT = createDT;
		this.makerID = makerID;
		this.typeId = typeId;
	}
}
