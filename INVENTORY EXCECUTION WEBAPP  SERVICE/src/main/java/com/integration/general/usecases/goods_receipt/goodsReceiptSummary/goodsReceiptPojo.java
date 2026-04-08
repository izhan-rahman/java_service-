package com.integration.general.usecases.goods_receipt.goodsReceiptSummary;

public interface goodsReceiptPojo {
        String getpono();
        String getgrno();
        String getsupplier();
        String getitem();
        String getitemdesc();
        String getloc();
        String getbatch();
        int getorderqty();
        int getreceiveqty();
        int getunitcost();
}
