package com.daigo.level6.domain.model;

import java.util.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class task {
    private int taskId;
    private boolean taskIsComplete;
    private String taskName;
    private Date taskAddDate;
    private Date taskDeadLineDate;
    private Date taskCompleteDate;
}
