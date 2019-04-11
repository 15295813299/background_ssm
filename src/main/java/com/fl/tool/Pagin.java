package com.fl.tool;

public class Pagin {
    //总页数
    private Integer countPage;
    //当前页数
    private Integer currentPage;
    //每页条数
    private Integer pageSize=10;
    //总条数
    private Integer countSum;

    //分页偏移量
    private Integer offset;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getCountPage() {
        return countPage;
    }

    public void setCountPage(Integer countPage) {
        this.countPage = countPage;

    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        this.offset=(currentPage-1)*pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCountSum() {
        return countSum;
    }

    public void setCountSum(Integer countSum) {
        this.countPage=countSum%this.pageSize==0?countSum/this.pageSize : countSum/this.pageSize+1;
        this.countSum = countSum;
    }

    @Override
    public String toString() {
        return "Pagin{" +
                "countPage=" + countPage +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", countSum=" + countSum +
                ", offset=" + offset +
                '}';
    }
}
