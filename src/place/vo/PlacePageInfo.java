package place.vo;

// 페이징 처리 정보를 저장하는 PageInfo 클래스 정의
public class PlacePageInfo {
	private int page;
	private int maxPage;
	private int startPage;
	private int endPage;
	private int listCount;
	
	// 기본 생성자 정의
	public PlacePageInfo() {}

	// 파라미터 5개 전달받는 생성자 정의
	public PlacePageInfo(int page, int maxPage, int startPage, int endPage, int listCount) {
		super();
		this.page = page;
		this.maxPage = maxPage;
		this.startPage = startPage;
		this.endPage = endPage;
		this.listCount = listCount;
	}
	
	// Getter/Setter 정의
	public int getPage() {
		return page;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public int getMaxPage() {
		return maxPage;
	}
	
	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}
	
	public int getStartPage() {
		return startPage;
	}
	
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	
	public int getEndPage() {
		return endPage;
	}
	
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	
	public int getListCount() {
		return listCount;
	}
	
	public void setListCount(int listCount) {
		this.listCount = listCount;
	}
	
	
	
}
