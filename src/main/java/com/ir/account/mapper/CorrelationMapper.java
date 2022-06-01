package com.ir.account.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ir.account.entity.Correlation;
import com.ir.account.entity.salevo.ReceiptRelationVo;

import java.util.List;

/**
 * <p>
 * 关联表 Mapper 接口
 * </p>
 *
 * @author pyf
 * @since 2022-04-30
 */
public interface CorrelationMapper extends BaseMapper<Correlation> {

    List<ReceiptRelationVo> getReceiptRelationVoByReceiptId(Integer receiptId);

}
