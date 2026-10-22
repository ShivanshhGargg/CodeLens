package com.shivansh.clb.repository;

import java.util.List;
import java.util.UUID;

import com.shivansh.clb.entity.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ChatMessageRepository extends JpaRepository<ChatMessage, UUID> {
    List<ChatMessage> findBySessionIdOrderByCreatedAtAsc(UUID sessionId);
}

