package com.example.util;

import java.util.List;

public class PaginationResult<T> {

    private List<T> content;
    private int currentPage;
    private int pageSize;
    private long totalItems;
    private int totalPages;

    public PaginationResult(List<T> content,
                            int currentPage,
                            int pageSize,
                            long totalItems) {
        this.content = content;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalItems = totalItems;

        this.totalPages = (int) Math.ceil((double) totalItems / pageSize);
    }

    public List<T> getContent() {
        return content;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public long getTotalItems() {
        return totalItems;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public boolean hasNext() {
        return currentPage < totalPages - 1;
    }

    public boolean hasPrevious() {
        return currentPage > 0;
    }
}