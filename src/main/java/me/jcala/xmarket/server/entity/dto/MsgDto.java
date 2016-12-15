package me.jcala.xmarket.server.entity.dto;

import lombok.Data;
import me.jcala.xmarket.server.entity.document.Message;

import java.util.List;

/**
 * 仅用消息传输
 * 对应Result的Data值
 */
@Data
public class MsgDto {
    /**
     * 用户所有消息的总量。
     * 客户端通过比对客户端存储的数值和此值是否相同，确认是否需要更新消息列表
     */
    private int allNum;

    /**
     * 客户端获取的消息列表
     * 并不是用户所有消息，已经被限定了数量
     */
    private List<Message> msgs;
}
