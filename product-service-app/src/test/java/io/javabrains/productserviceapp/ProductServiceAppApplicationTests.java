package io.javabrains.productserviceapp;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ProductServiceAppApplicationTests {

    @Test
    void contextLoads() {
    }
}


	/*private MockMvc mockMvc;
	@Autowired
	private WebApplicationContext context;

	ObjectMapper om = new ObjectMapper();

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void addEmployeeTest() throws Exception {
		Product product = new Product();
		product.setProductType("Mobile");
		product.setProductName("OnePlus 10 Pro");
		String jsonRequest = om.writeValueAsString(product);
		MvcResult result = mockMvc.perform(post("/post").content(jsonRequest)
				.contentType(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isOk()).andReturn();
		String resultContent = result.getResponse().getContentAsString();
		Response response = om.readValue(resultContent, Response.class);
		Assert.assertTrue(response.isStatus() == Boolean.TRUE);

	}

	@Test
	public void getEmployeesTest() throws Exception {
		MvcResult result = mockMvc
				.perform(get("/get").content(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn();
		String resultContent = result.getResponse().getContentAsString();
		Response response = om.readValue(resultContent, Response.class);
		Assert.assertTrue(response.isStatus() == Boolean.TRUE);

	}*/
