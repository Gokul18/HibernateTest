package in.co.sunrays.dto;

import java.util.Set;

public class CompanyDTO {
	private long id;
	private String companyName;
	private String companyAddress;
	private Set<VendorDTO> vendorDto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public Set<VendorDTO> getVendorDto() {
		return vendorDto;
	}

	public void setVendorDto(Set<VendorDTO> vendorDto) {
		this.vendorDto = vendorDto;
	}

}
