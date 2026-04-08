package com.integration.general.usecases.goods_receipt;


import com.integration.general.persistence.models.RecvDet;
import com.integration.general.usecases.goods_receipt.goodsReceiptSummary.goodsReceiptPojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsReceiptRepository extends JpaRepository<RecvDet, Integer> {
    List<RecvDet> findBygrNo(String pk0);

    @Query(value="select * from ##plant##RECVDET " +
            "where PONO = :pk0 " ,nativeQuery = true)
    List<RecvDet> findBypoNo(String pk0);

    @Query(value="select sum(RECQTY*UNITCOST) as amount  from ##plant##RECVDET where poNo = :pono AND GRNO = :grno " ,nativeQuery = true)
    String findByPoNoOrderByItem(String pono,String grno);

    @Query(value="select sum(RECQTY) as QTY  from ##plant##RECVDET where PONO = :pono AND GRNO = :grno " ,nativeQuery = true)
    String findByPoNoOrderByQty(String pono,String grno);

    @Query(value="select sum(UNITCOST*RECQTY) as TOTALAMOUNT   from ##plant##RECVDET " +
//            @Query(value="select sum(UNITCOST*ORDQTY) as TOTALAMOUNT   from ##plant##RECVDET " +
            "where poNo = :pono " ,nativeQuery = true)
    String findByPoNoAmount(String pono);

    @Query(value="select * from ##plant##RECVDET " +
            "where poNo = :pono AND item = :item AND LNNO = :lnno" ,nativeQuery = true)
    List<RecvDet> findByPoNoAndItem(String pono, String item, int lnno);

    @Query(value="SELECT PONO,GRNO,CNAME as SUPPLIER,ITEM,ITEMDESC,LOC,BATCH," +
            "ORDQTY as ORDERQTY,RECQTY AS RECEIVEQTY,UNITCOST " +
            "FROM ##plant##RECVDET WHERE GRNO =:grno AND PLANT =:plant " ,nativeQuery = true)
    List<goodsReceiptPojo> getGrnoSummaryFilter(String grno, String plant);
}
