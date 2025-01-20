package SequenceGeneratorPkg;

public class PartyDo {

	int partySeq;
	int addressSeq;
	public PartyDo(int partySeq, int addressSeq) {
		
		this.partySeq = partySeq;
		this.addressSeq = addressSeq;
	}
	public int getPartySeq() {
		return partySeq;
	}
	public void setPartySeq(int partySeq) {
		this.partySeq = partySeq;
	}
	public int getAddressSeq() {
		return addressSeq;
	}
	public void setAddressSeq(int addressSeq) {
		this.addressSeq = addressSeq;
	}
	@Override
	public String toString() {
		return "PartyDo [partySeq=" + partySeq + ", addressSeq=" + addressSeq
				+ "]";
	}
	
	
	
}
