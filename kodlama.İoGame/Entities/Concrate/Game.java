package Concrate;

public class Game {
	
	private int id;
	public Game(int id, int playerId, int name, int price, int campaignId) {
		super();
		this.id = id;
		this.playerId = playerId;
		this.name = name;
		this.price = price;
		this.campaignId = campaignId;
	}
	private int playerId;
	private int name;
	private int price;
	private int campaignId;
	
	public int getId() {
		return id;
	}
	public int getPlayerId() {
		return playerId;
	}
	public int getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getCampaignId() {
		return campaignId;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public void setName(int name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

}
