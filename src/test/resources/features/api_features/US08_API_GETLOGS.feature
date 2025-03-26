@apius08
Feature:US_08 Get logs from log-controller

Scenario: Get logs from log-controller

Given A Get request is sent logs controller
Then Is the response status code 200
  And Validate pageable.pageNumber and pageable.pageSize
  And Check the content field


