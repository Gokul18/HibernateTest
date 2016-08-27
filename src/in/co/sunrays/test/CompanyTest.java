package in.co.sunrays.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import in.co.sunrays.dto.CompanyDTO;
import in.co.sunrays.dto.VendorDTO;
import in.co.sunrays.service.CompanyService;

public class CompanyTest {
	public static void main(String[] args) {
		 //testAdd();
		// testupDate();
		testget();
	}

	public static void testAdd() {
		VendorDTO dto = new VendorDTO();
		dto.setVendorName("hero");
		dto.setVendorCity("mpur");

		VendorDTO dto2 = new VendorDTO();
		dto2.setVendorName("B ");
		dto2.setVendorCity("Pi");

		VendorDTO dto3 = new VendorDTO();
		dto3.setVendorName("Windalji");
		dto3.setVendorCity("Pune");

		VendorDTO dto4 = new VendorDTO();
		dto4.setVendorName("Jyotiji");
		dto4.setVendorCity("Mumbai");

		Set<VendorDTO> vendorDTOs = new HashSet<VendorDTO>();
		vendorDTOs.add(dto);
		vendorDTOs.add(dto2);
		vendorDTOs.add(dto3);
		vendorDTOs.add(dto4);

		CompanyDTO companyDTO = new CompanyDTO();
		companyDTO.setCompanyName("For");
		companyDTO.setCompanyAddress("Pit");
		companyDTO.setVendorDto(vendorDTOs);

		CompanyService service = new CompanyService();
		service.add(companyDTO);
	}

	private static void testupDate() {
		VendorDTO dto = new VendorDTO();
		dto.setId(10);
		dto.setVendorCity("waidhan city waidhan");
		dto.setVendorName("reliance power plant");
		VendorDTO dto1 = new VendorDTO();
		dto1.setId(11);
		dto1.setVendorName("ncl colindia");
		dto1.setVendorCity("ja mp");

		Set<VendorDTO> vendorDTOs = new HashSet<VendorDTO>();
		vendorDTOs.add(dto);
		vendorDTOs.add(dto1);
		CompanyDTO companyDTO = new CompanyDTO();
		companyDTO.setId(3);
		companyDTO.setCompanyName("NTPC shati nagar");
		companyDTO.setCompanyAddress("VIDHY mp");
		companyDTO.setVendorDto(vendorDTOs);

		CompanyService service = new CompanyService();
		service.update(companyDTO);
	}

	private static void testget() {
		CompanyService service = new CompanyService();
		CompanyDTO dto =  service.get(2);
		System.out.println(dto.getCompanyAddress());
		System.out.println(dto.getCompanyName());
		Iterator it=dto.getVendorDto().iterator();
		while (it.hasNext()) {
			VendorDTO object = (VendorDTO) it.next();
			System.out.println(object.getVendorCity());
		}
	}
}
