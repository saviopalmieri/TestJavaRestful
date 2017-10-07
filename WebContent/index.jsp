<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="taskManagerApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AngularJS Task Manager</title>
<script data-require="angular.js@*" data-semver="1.2.13" src="http://code.angularjs.org/1.2.13/angular.js"></script>
<script type="text/javascript" src="./js/app.js"></script>
</head>
<body>
<div ng-controller="taskManagerController">
 <div id="task-panel" class="fadein fadeout showpanel panel"  ng-show="toggle"> 
  <div class="panel-heading">
   <i class="panel-title-icon fa fa-tasks"></i>
   <span class="panel-title">Recent Tasks</span>
   <div class="panel-heading-controls">
    <button ng-click="toggle = !toggle" >Add New Task</button>
    <button confirmed-click="archiveTasks()" ng-confirm-click="Would you like to archive completed tasks?">Clear completed tasks</button>
   </div>
  </div>
  <div>
   <div ng-repeat="task in tasks">
    <span>
     {{task.taskPriority}}
    </span>
    <div>
     <input id="{{task.taskId}}" type="checkbox" value="{{task.taskId}}" ng-checked="selection.indexOf(task.taskId) > -1" ng-click="toggleSelection(task.taskId)" />
       <label for="{{task.taskId}}"></label>  
    </div>
    <div ng-if="task.taskStatus=='COMPLETED'">    
     <a href="#" class="checkedClass">
      {{task.taskName}}
     <span class="action-status">{{task.taskStatus}}</span>
     </a>
    </div>
    <div ng-if="task.taskStatus=='ACTIVE'">    
     <a href="#" class="uncheckedClass">
      {{task.taskName}}
      <span class="action-status">{{task.taskStatus}}</span>
     </a>
    </div>
   </div>
  </div>
 </div>
 <div id="add-task-panel" ng-hide="toggle">
  <div>
   <span>Add Task</span>
   <div>
    <button ng-click="toggle = !toggle">Show All Tasks</button>
   </div>
  </div>
  <div>
   <div>
    <table>
     <tr>
      <td>Task Name:</td>
      <td><input type="text" ng-model="taskName"/></td>
     </tr>
     <tr>
      <td>Task Description:</td>
      <td><input type="text" ng-model="taskDesc"/></td>
     </tr>
     <tr>
      <td>Task Status:</td>
      <td>
       <select ng-model="taskStatus" ng-options="status as status for status in statuses">
        <option value="">-- Select --</option>      
            </select>
      </td>
     </tr>
     <tr>
      <td>Task Priority:</td>
      <td>
       <select ng-model="taskPriority" ng-options="priority as priority for priority in priorities">
        <option value="">-- Select --</option>
       </select>
      </td>
     </tr>
     <tr>
      <td>
<button ng-click="addTask()" class="btn-panel-big">Add New Task</button></td>
     </tr>
    </table>        
   </div>
  </div>
 </div>
</div>
</body>
</html>